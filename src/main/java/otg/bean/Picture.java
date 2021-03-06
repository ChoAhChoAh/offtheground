package otg.bean;

import java.util.Date;

public class Picture {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.picture_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private Integer pictureId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.picture_code
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private String pictureCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.picture_url
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private String pictureUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.relate_type
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private String relateType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.relate_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private Integer relateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.add_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private Date addDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column picture.update_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.picture_id
     *
     * @return the value of picture.picture_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Integer getPictureId() {
        return pictureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.picture_id
     *
     * @param pictureId the value for picture.picture_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.picture_code
     *
     * @return the value of picture.picture_code
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public String getPictureCode() {
        return pictureCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.picture_code
     *
     * @param pictureCode the value for picture.picture_code
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setPictureCode(String pictureCode) {
        this.pictureCode = pictureCode == null ? null : pictureCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.picture_url
     *
     * @return the value of picture.picture_url
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.picture_url
     *
     * @param pictureUrl the value for picture.picture_url
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.relate_type
     *
     * @return the value of picture.relate_type
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public String getRelateType() {
        return relateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.relate_type
     *
     * @param relateType the value for picture.relate_type
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setRelateType(String relateType) {
        this.relateType = relateType == null ? null : relateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.relate_id
     *
     * @return the value of picture.relate_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Integer getRelateId() {
        return relateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.relate_id
     *
     * @param relateId the value for picture.relate_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setRelateId(Integer relateId) {
        this.relateId = relateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.add_date
     *
     * @return the value of picture.add_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.add_date
     *
     * @param addDate the value for picture.add_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column picture.update_date
     *
     * @return the value of picture.update_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column picture.update_date
     *
     * @param updateDate the value for picture.update_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}