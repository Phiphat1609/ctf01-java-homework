package com.ctf01.javahomework.part4;

public interface IWindowsInstaller {
	public void formatWindows(String drive);
	public void installWindows(String version, String productKey);
	public int getLastInstalledWindowsVersion();
}
