package com.driver;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhatsappService {
    WhatsappRepository whatsappRepository=new WhatsappRepository();

    public String createUser(String number, String name) throws Exception{
        return whatsappRepository.addUser(number, name);
    }

    public Group createGroup(List<User> users){
        return whatsappRepository.createGroup(users);
    }

    public int createMessage(String content){
        return whatsappRepository.createMessage(content);
    }

    public int sendMessage(Message message, User sender, Group group) throws Exception{
        return whatsappRepository.sendMessageToGroup(message, sender, group);
    }

    public String changeAdmin(User approver, User user, Group group) throws Exception{
        return whatsappRepository.changeAdmin(approver, user, group);
    }

}
