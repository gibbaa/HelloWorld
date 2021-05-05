package com.gibbaa.javaPart4_Answer14;

public interface ICleaner {
	public void setTools(String toolName);
	public void clean(String building, String roomName);
	public String[] getCleanedRoom();
}
