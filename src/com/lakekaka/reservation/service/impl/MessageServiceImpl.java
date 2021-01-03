package com.lakekaka.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakekaka.mapper.MessageMapper;
import com.lakekaka.pojo.Message;
import com.lakekaka.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{
	
	@Autowired
	MessageMapper messageMapper;
	
	@Override
	public boolean insertMessage(Message msg) {
		try {
			boolean flag = messageMapper.insertMessage(msg);
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	@Override
	public Message findById(int id) {
		try {
			Message msg = messageMapper.selectById(id);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Message> findAllNews() {
		try {
			List<Message> msgList = messageMapper.selectAllNews();
			return msgList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Message> findAllHelp() {
		try {
			List<Message> msgList = messageMapper.selectAllHelp();
			return msgList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Message> findAllSuggestion() {
		try {
			List<Message> msgList = messageMapper.selectAllSuggestion();
			return msgList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean deleteById(int id) {
		try {
			boolean flag = messageMapper.deleteById(id);
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean updateMsg(Message msg) {
		try {
			boolean flag = messageMapper.updateMsg(msg);
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
