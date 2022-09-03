package com.wxs.mail.service;

import com.wxs.mail.domain.MailRequest;

public interface SendMailService {

    /**
     * 简单文本邮件
     *
     * @param mailRequest
     */
    void sendSimpleMail(MailRequest mailRequest);


    /**
     * Html格式邮件,可带附件
     *
     * @param mailRequest
     */
    void sendHtmlMail(MailRequest mailRequest);
}