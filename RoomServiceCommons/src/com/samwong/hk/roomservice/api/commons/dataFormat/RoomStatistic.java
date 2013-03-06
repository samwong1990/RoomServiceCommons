package com.samwong.hk.roomservice.api.commons.dataFormat;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class RoomStatistic{
	private String roomName;
	private String algorithmName;
	private AtomicInteger numOfTrials = new AtomicInteger(0);
	private Map<String, AtomicInteger> roomHits = new ConcurrentHashMap<String, AtomicInteger>();
	
	public RoomStatistic(){}
	
	public RoomStatistic withRoomName(String roomName){
		this.roomName = roomName;
		roomHits.put(roomName, new AtomicInteger(0));
		return this;
	}
	
	public RoomStatistic withAlgorithm(String algorithmName){
		this.algorithmName = algorithmName;
		return this;
	}
	
	public String getAlgorithmName(){
		return algorithmName;
	}
	
	public int getHits(){
		return roomHits.get(roomName).get();
	}
	
	public int getNumOfTrials(){
		return numOfTrials.get();
	}
	
	/**
	 * @return a copy of the results
	 */
	public Map<String, AtomicInteger> getRoomToHitMap(){
		return new HashMap<String, AtomicInteger>(roomHits);
	}
	
	public String getRoomName(){
		return roomName;
	}
	
	public void hit(String predictedRoom){
		numOfTrials.incrementAndGet();
		if(!roomHits.containsKey(predictedRoom)){
			roomHits.put(predictedRoom, new AtomicInteger(0));
		}
		roomHits.get(predictedRoom).incrementAndGet();
	}
}