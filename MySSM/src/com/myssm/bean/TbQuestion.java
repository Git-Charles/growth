package com.myssm.bean;

import javax.persistence.*;

@Table(name = "tb_question")
public class TbQuestion {
    @Id
    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "question_right")
    private String questionRight;

    @Column(name = "question_content")
    private String questionContent;

    @Column(name = "question_A")
    private String questionA;

    @Column(name = "question_B")
    private String questionB;

    @Column(name = "question_c")
    private String questionC;

    @Column(name = "question_D")
    private String questionD;

    /**
     * @return question_id
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * @return question_title
     */
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * @param questionTitle
     */
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    /**
     * @return question_right
     */
    public String getQuestionRight() {
        return questionRight;
    }

    /**
     * @param questionRight
     */
    public void setQuestionRight(String questionRight) {
        this.questionRight = questionRight;
    }

    /**
     * @return question_content
     */
    public String getQuestionContent() {
        return questionContent;
    }

    /**
     * @param questionContent
     */
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    /**
     * @return question_A
     */
    public String getQuestionA() {
        return questionA;
    }

    /**
     * @param questionA
     */
    public void setQuestionA(String questionA) {
        this.questionA = questionA;
    }

    /**
     * @return question_B
     */
    public String getQuestionB() {
        return questionB;
    }

    /**
     * @param questionB
     */
    public void setQuestionB(String questionB) {
        this.questionB = questionB;
    }

    /**
     * @return question_c
     */
    public String getQuestionC() {
        return questionC;
    }

    /**
     * @param questionC
     */
    public void setQuestionC(String questionC) {
        this.questionC = questionC;
    }

    /**
     * @return question_D
     */
    public String getQuestionD() {
        return questionD;
    }

    /**
     * @param questionD
     */
    public void setQuestionD(String questionD) {
        this.questionD = questionD;
    }
}