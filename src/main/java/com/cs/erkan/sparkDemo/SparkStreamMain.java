package com.cs.erkan.sparkDemo;

import java.util.ArrayList;

public class SparkStreamMain {
	 public static void main(String[] args) throws Exception {

	        //List<String> topicList = new ArrayList<>();
	        //topicList.add("tweet");
	        //KafkaStreaming kafkaStream = new KafkaStreaming(topicList, 2);
	        //kafkaStream.SparkStreaming(topicList, 2);
	        ArrayList<String> topicList = new ArrayList<>();
	        topicList.add("tweet");
	        KafkaStreaming kafkaStream = new KafkaStreaming("KafkaSparkStreaming", topicList,2);
	    }
}
