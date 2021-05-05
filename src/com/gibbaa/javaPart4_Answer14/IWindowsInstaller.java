package com.gibbaa.javaPart4_Answer14;

public interface IWindowsInstaller {
	public void formatWindows(String drive);
	public void installWindows(String version, String productKey);
	public int getLastInstalledWindowsVersion();
}
