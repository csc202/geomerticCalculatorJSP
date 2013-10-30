package com.posbravo.count;
public class Counter {
	int start;
	int end;
	int count=0;
	public Counter(int start, int end) {
		this.count = start-1;
		this.start = start;
		this.end = end;
	}
	public int increment() {
		this.count++;
		return this.count;
	}
}
