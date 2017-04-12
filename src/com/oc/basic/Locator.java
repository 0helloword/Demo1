//封装元素，Webdriver的元素，每个元素都有相应的定位地址（xpath路径或css或id）等待时间和定位类型，默认为By.xpath

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