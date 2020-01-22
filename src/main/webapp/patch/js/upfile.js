var index=0;
var PATCH_PATH="patchPath";
var PATCH_FILE="patchFile";
var PATCH_TYPE="patchType";
var PATCH_DIV="patch";

var filesList = new Array();
var next_upload_flag = true;

function addOne(){
	let patchDiv = document.createElement("div");
	let path = document.createElement("input");
	let file = document.createElement("input");
	let opType = document.createElement("select");
	let opAdd = document.createElement("option");
	let opDelete = document.createElement("option");
	let remove = document.createElement("button");
	

	patchDiv.setAttribute("id",PATCH_DIV+index);
	patchDiv.setAttribute("class",PATCH_DIV+"class");
	
	path.setAttribute("type","text");
	path.setAttribute("id",PATCH_PATH+index);
	
	file.setAttribute("type","file");
	file.setAttribute("id",PATCH_FILE+index);
	file.onchange=addfile;
	
	opType.setAttribute("id",PATCH_TYPE+index);
	opAdd.value="add";
	opAdd.text="add";
	opDelete.value="delete";
	opDelete.text="delete";
	opType.add(opAdd);
	opType.add(opDelete);
	opType.onchange=selectOpType;
	
	remove.setAttribute("id",PATCH_DIV+"Remove"+index);
	remove.onclick=removeFile;
	remove.innerHTML="remove";
	
	patchDiv.appendChild(path);
	patchDiv.appendChild(file);
	patchDiv.appendChild(opType);
	patchDiv.appendChild(remove);
	let target = document.getElementById("target");
	target.appendChild(patchDiv);
}


function selectOpType(){
	let currentId = this.parentNode.id;
	for(let i=0;i<filesList.length;i++){
		if(filesList[i].id===currentId){
			filesList[i].opType=this.value;
			return;
		}
	}
}

function removeFile(){
	let target = this.parentNode.parentNode;
	let patchNode = this.parentNode;
	let patchId = patchNode.id;
	target.removeChild(patchNode);
	for(let i=0;i<filesList.length;i++){
		if(filesList[i].id===patchId){
			filesList.splice(i,1);
			return;
		}
	}
}

function UploadFile(id,path,file,opType){
	this.id = id;
	this.file = file;
	this.state = 0;
	this.path=path;
	this.opType=opType;
}

function addfile(evt){
	let messageBox = document.getElementById("messageBox");
	messageBox.innerHTML="";
	let f = this.files[0];
	let id = this.parentNode.id;
	if(f!=undefined){
		let pathString = this.previousElementSibling.value;
		let opType = this.nextElementSibling.value;
		if(pathString==null||pathString==undefined||pathString.length===0){
			alert("please input path");
			return;
		}
		let uf = new UploadFile(id,pathString,f,opType);
		filesList.push(uf);
	}else{
		alert("please select file");
		return;
	}
}

function submitUpload(){
	var xhr = new XMLHttpRequest();
	if(xhr!=null){
		let messageBox = document.getElementById("messageBox");
		messageBox.innerHTML="Patching Now.."
		var formData = new FormData();
		for(let i=0;i<filesList.length;i++){
			formData.append(filesList[i].opType+"|"+filesList[i].path,filesList[i].file);
		}
		xhr.open("POST","../patch",true);
		xhr.onreadystatechange=function(e){
			if(xhr.readyState===4&&xhr.status===200){
				messageBox.innerHTML="";
				removeAll();
				filesList.splice(0,filesList.length);
				let rt = xhr.responseText;
				messageBox.innerHTML=rt;
			}
		}
		xhr.send(formData);
	}
}

function removeAll(){
	filesList.splice(0,filesList.length);
	var target = document.getElementById("target");
	target.innerHTML="";
}
