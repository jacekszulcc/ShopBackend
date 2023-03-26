package cc.szulc.shop.common.mail;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;

//@Configuration
public class EmailConfig {

    @Bean
    @ConditionalOnProperty(name="app.email.sender", matchIfMissing = true, havingValue = "emailSimpleService")
    public EmailSender emailSimpleService(JavaMailSender javaMailSender){
        return new EmailSimpleService(javaMailSender);
    }

    @Bean
    @ConditionalOnProperty(name="app.email.sender", havingValue = "fakeSimpleService")
    public EmailSender fakeSimpleService(){
        return new FakeEmailService();
    }
}
