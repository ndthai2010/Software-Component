package src.homework4_1_4;

public class MyTime {
	
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		String hourAfter = (hour / 10 == 0 ? ("0" + hour) : (hour + ""));
		String minuAfter = (minute / 10 == 0 ? ("0" + minute) : (minute + ""));
		String secondAfter = (second / 10 == 0 ? ("0" + second) : (second + ""));
		return hourAfter + ":" + minuAfter + ":" + secondAfter;
	}

	public MyTime nextSecond() {
		int addSecond = (second + 1) / 60;
		int addMinute = (addSecond + minute) / 60;
		second = ((second + 1) % 60);
		minute = (minute + addSecond) % 60;
		hour = (hour + addMinute) % 24;
		return this;
	}

	public MyTime nextMinute() {
		int addMinute = (minute + 1) / 60;
		minute = (minute + 1) % 60;
		hour = (hour + addMinute) % 24;
		return this;
	}

	public MyTime nextHour() {
		hour = (hour + 1) % 24;
		return this;
	}

	public MyTime previousSecond() {
		int subtractSecond = ((second - 1) == -1) ? 1 : 0;
		int subtractMinute = ((minute - subtractSecond) == -1) ? 1 : 0;
		second = ((second - 1) == -1) ? 59 : second - 1;
		minute = ((minute - subtractSecond) == -1) ? 59 : minute - subtractSecond;
		hour = ((hour - subtractMinute) == -1) ? 23 : (hour - subtractMinute);
		return this;
	}

	public MyTime previousMinute() {
		int subtractMinute = ((minute - 1) == -1) ? 1 : 0;
		minute = ((minute - 1) == -1) ? 59 : minute - 1;
		hour = ((hour - subtractMinute) == -1) ? 23 : (hour - subtractMinute);
		return this;
	}

	public MyTime previousHour() {
		hour = (hour - 1 == -1) ? 23 : hour - 1;
		return this;
	}
}
