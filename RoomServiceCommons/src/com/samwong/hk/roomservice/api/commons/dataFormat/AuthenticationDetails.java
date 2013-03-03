package com.samwong.hk.roomservice.api.commons.dataFormat;

public class AuthenticationDetails {
	private String deviceWifiMacAddress;
	private String deviceBrand;
	private String deviceManaufacturer;
	private String deviceModel;
	private String deviceProduct;
	private String deviceSerial;
	private String deviceInstallID;
	private double deviceLatitude;
	private double deviceLongitude;
	private float locationAccuracy;
	
	public float getLocationAccuracy(){
		return locationAccuracy;
	}
	
	public AuthenticationDetails withLocationAccuracy(float accuracy){
		this.locationAccuracy = accuracy;
		return this;
	}
	
	public String getDeviceWifiMacAddress() {
		return deviceWifiMacAddress;
	}

	public AuthenticationDetails withDeviceWifiMacAddress(
			String deviceWifiMacAddress) {
		this.deviceWifiMacAddress = deviceWifiMacAddress;
		return this;
	}

	public String getDeviceBrand() {
		return deviceBrand;
	}

	public AuthenticationDetails withDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
		return this;
	}

	public String getDeviceManaufacturer() {
		return deviceManaufacturer;
	}

	public AuthenticationDetails withDeviceManaufacturer(
			String deviceManaufacturer) {
		this.deviceManaufacturer = deviceManaufacturer;
		return this;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public AuthenticationDetails withDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
		return this;
	}

	public String getDeviceProduct() {
		return deviceProduct;
	}

	public AuthenticationDetails withDeviceProduct(String deviceProduct) {
		this.deviceProduct = deviceProduct;
		return this;
	}

	public String getDeviceSerial() {
		return deviceSerial;
	}

	public AuthenticationDetails withDeviceSerial(String deviceSerial) {
		this.deviceSerial = deviceSerial;
		return this;
	}

	public String getDeviceInstallID() {
		return deviceInstallID;
	}

	public AuthenticationDetails withDeviceInstallID(String deviceInstallID) {
		this.deviceInstallID = deviceInstallID;
		return this;
	}

	public double getDeviceLongitude() {
		return deviceLongitude;
	}

	public AuthenticationDetails withDeviceLongitude(double deviceLongitude) {
		this.deviceLongitude = deviceLongitude;
		return this;
	}

	public double getDeviceLatitude() {
		return deviceLatitude;
	}

	public AuthenticationDetails withDeviceLatitude(double deviceLatitude) {
		this.deviceLatitude = deviceLatitude;
		return this;
	}
	
	@Override
	public String toString() {
		return "AuthenticationDetails [deviceWifiMacAddress="
				+ deviceWifiMacAddress + ", deviceBrand=" + deviceBrand
				+ ", deviceManaufacturer=" + deviceManaufacturer
				+ ", deviceModel=" + deviceModel + ", deviceProduct="
				+ deviceProduct + ", deviceSerial=" + deviceSerial
				+ ", deviceInstallID=" + deviceInstallID + ", deviceLatitude="
				+ deviceLatitude + ", deviceLongitude=" + deviceLongitude
				+ ", locationAccuracy=" + locationAccuracy + "]";
	}
}
