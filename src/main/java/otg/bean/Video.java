package otg.bean;

import java.util.Date;

public class Video {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.video_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private Integer videoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.video_code
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private String videoCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.video_url
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private String videoUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.relate_type
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private String relateType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.relate_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private Integer relateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.add_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private Date addDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video.update_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.video_id
     *
     * @return the value of video.video_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.video_id
     *
     * @param videoId the value for video.video_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.video_code
     *
     * @return the value of video.video_code
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public String getVideoCode() {
        return videoCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.video_code
     *
     * @param videoCode the value for video.video_code
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode == null ? null : videoCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.video_url
     *
     * @return the value of video.video_url
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.video_url
     *
     * @param videoUrl the value for video.video_url
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.relate_type
     *
     * @return the value of video.relate_type
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public String getRelateType() {
        return relateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.relate_type
     *
     * @param relateType the value for video.relate_type
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setRelateType(String relateType) {
        this.relateType = relateType == null ? null : relateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.relate_id
     *
     * @return the value of video.relate_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Integer getRelateId() {
        return relateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.relate_id
     *
     * @param relateId the value for video.relate_id
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setRelateId(Integer relateId) {
        this.relateId = relateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.add_date
     *
     * @return the value of video.add_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.add_date
     *
     * @param addDate the value for video.add_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video.update_date
     *
     * @return the value of video.update_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video.update_date
     *
     * @param updateDate the value for video.update_date
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}