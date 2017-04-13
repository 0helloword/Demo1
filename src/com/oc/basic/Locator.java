//灏佽鍏冪礌锛學ebdriver鐨勫厓绱狅紝姣忎釜鍏冪礌閮芥湁鐩稿簲鐨勫畾浣嶅湴鍧�紙xpath璺緞鎴朿ss鎴杋d锛夌瓑寰呮椂闂村拰瀹氫綅绫诲瀷锛岄粯璁や负By.xpath

package com.oc.basic;

public class Locator {
	private String element;

	// default is 5 sec
	private int waitSec = 5;

	public enum ByType {
		xpath, id, linkText, name, className, cssSelector, partialLinkText, tagName
	}

	private ByType byType;

	public Locator() {

	}

	public Locator(String element) {
		this.element = element;
		this.waitSec = 3;
		this.byType = ByType.xpath;
	}

	public Locator(String element, int waitSec) {
		this.waitSec = waitSec;
		this.element = element;
		this.byType = ByType.xpath;
	}

	public Locator(String element, int waitSec, ByType byType) {
		this.waitSec = waitSec;
		this.element = element;
		this.byType = byType;
	}

	public String getElement() {
		return element;
	}

	public int getWaitSec() {
		return waitSec;
	}

	public ByType getBy() {
		return byType;
	}

	public void setBy(ByType byType) {
		this.byType = byType;
	}


}
