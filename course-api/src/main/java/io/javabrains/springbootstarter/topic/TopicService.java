package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring","spring Framework","spring framework description"),
			new Topic("java","spring java Framework","spring java description"),
			new Topic("js","javadscrpt","javascrpti description"),
			new Topic("js","javadscrpt","javascrpti description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
		
	}
	
	// get Id Topics
	public Topic getTopic(String id) {
		// TODO Auto-generated method stub
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		 
	}
	
	
	// post or add topics
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}
	
	// put or update topics
	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			Topic t  = topics.get(i);
			
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t-> t.getId().equals(id));
		
	}
	
	
}
