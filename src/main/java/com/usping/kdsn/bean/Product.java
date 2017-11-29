package com.usping.kdsn.bean;

import com.usping.kdsn.util.model.BaseEntity;

public class Product extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Id
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Title
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Keywords
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Company
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String company;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Type
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.URL
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Picture
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String picture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Assortment1
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String assortment1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Assortment2
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String assortment2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Assortment3
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String assortment3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Assortment4
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String assortment4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Assortment5
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String assortment5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Assortment6
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String assortment6;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.uid
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Text
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    private String text;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Id
     *
     * @return the value of product.Id
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Id
     *
     * @param id the value for product.Id
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Title
     *
     * @return the value of product.Title
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Title
     *
     * @param title the value for product.Title
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Keywords
     *
     * @return the value of product.Keywords
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Keywords
     *
     * @param keywords the value for product.Keywords
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Company
     *
     * @return the value of product.Company
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Company
     *
     * @param company the value for product.Company
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Type
     *
     * @return the value of product.Type
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Type
     *
     * @param type the value for product.Type
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.URL
     *
     * @return the value of product.URL
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.URL
     *
     * @param url the value for product.URL
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Picture
     *
     * @return the value of product.Picture
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Picture
     *
     * @param picture the value for product.Picture
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Assortment1
     *
     * @return the value of product.Assortment1
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getAssortment1() {
        return assortment1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Assortment1
     *
     * @param assortment1 the value for product.Assortment1
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setAssortment1(String assortment1) {
        this.assortment1 = assortment1 == null ? null : assortment1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Assortment2
     *
     * @return the value of product.Assortment2
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getAssortment2() {
        return assortment2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Assortment2
     *
     * @param assortment2 the value for product.Assortment2
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setAssortment2(String assortment2) {
        this.assortment2 = assortment2 == null ? null : assortment2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Assortment3
     *
     * @return the value of product.Assortment3
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getAssortment3() {
        return assortment3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Assortment3
     *
     * @param assortment3 the value for product.Assortment3
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setAssortment3(String assortment3) {
        this.assortment3 = assortment3 == null ? null : assortment3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Assortment4
     *
     * @return the value of product.Assortment4
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getAssortment4() {
        return assortment4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Assortment4
     *
     * @param assortment4 the value for product.Assortment4
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setAssortment4(String assortment4) {
        this.assortment4 = assortment4 == null ? null : assortment4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Assortment5
     *
     * @return the value of product.Assortment5
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getAssortment5() {
        return assortment5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Assortment5
     *
     * @param assortment5 the value for product.Assortment5
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setAssortment5(String assortment5) {
        this.assortment5 = assortment5 == null ? null : assortment5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Assortment6
     *
     * @return the value of product.Assortment6
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getAssortment6() {
        return assortment6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Assortment6
     *
     * @param assortment6 the value for product.Assortment6
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setAssortment6(String assortment6) {
        this.assortment6 = assortment6 == null ? null : assortment6.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.uid
     *
     * @return the value of product.uid
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.uid
     *
     * @param uid the value for product.uid
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Text
     *
     * @return the value of product.Text
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Text
     *
     * @param text the value for product.Text
     *
     * @mbg.generated Mon Nov 20 16:46:11 CET 2017
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}