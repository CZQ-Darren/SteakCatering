package com.javacto.utils.mail;

import java.io.UnsupportedEncodingException;

public class SendEmail {
	private final static String EMAIL = "czq_hardy@163.com";
	private final static String EMAIL_PWD = "AOJDQKFSSLSHUQOI";
	private static String title = "贵族食代";
	private static String content = "<h3>真诚的欢迎您加入贵族食代!</h3>\n" + "<h5>请保管好您的账号和密码，以便进行登录</h5>";

	public static void send(String email){
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName(EMAIL);//登陆邮件发送服务器的用户名
		mailInfo.setPassword(EMAIL_PWD);// 邮箱密码
		mailInfo.setFromAddress(EMAIL);//邮件发送者的地址
		mailInfo.setToAddress(email);//邮件接收者的地址
		mailInfo.setSubject(title);
		mailInfo.setContent(content);

		// 发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		//sms.sendTextMail(mailInfo);// 发送文体格式
		try {
			sms.sendHtmlMail(mailInfo);// 发送html格式
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
