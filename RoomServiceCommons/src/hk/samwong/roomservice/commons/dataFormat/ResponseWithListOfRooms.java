package hk.samwong.roomservice.commons.dataFormat;

import java.util.List;

public class ResponseWithListOfRooms extends Response {
	
	private List<String> roomList;
	
	public ResponseWithListOfRooms withRoomList(List<String> roomList){
		this.roomList = roomList;
		return this;
	}

	public List<String> getListOfRooms() {
		return roomList;
	}
	
	@Override
	public String toString() {
		return "ResponseWithListOfRooms [roomList=" + roomList + "]" + super.toString();
	}
}
