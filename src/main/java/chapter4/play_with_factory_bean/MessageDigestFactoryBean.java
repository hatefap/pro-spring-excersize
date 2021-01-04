package chapter4.play_with_factory_bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;

public class MessageDigestFactoryBean implements FactoryBean<MessageDigest>, InitializingBean {

    private String algorithmName = "MD5";
    private MessageDigest messageDigest = null;
    @Override
    public MessageDigest getObject() throws Exception {
        System.out.println("getObject called");
        return messageDigest;
    }

    @Override
    public Class<?> getObjectType() {

        return MessageDigest.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        messageDigest = MessageDigest.getInstance(algorithmName);
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

}
