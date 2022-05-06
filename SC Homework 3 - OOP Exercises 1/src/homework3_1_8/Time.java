package src.homework3_1_8;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
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
		return (hour / 10 == 0 ? "0" + hour : hour) + ":" + (minute / 10 == 0 ? "0" + minute : minute) + ":"
				+ (second / 10 == 0 ? "0" + second : second);
	}
	
	public Time nextSecond() {
		if (second == 59) {
			second = 0;
		if (minute == 59) {
			minute = 0;
		if (hour == 23) {
			hour = 0;
		} else {
			hour++;
			}
		} else {
			minute++;
			}
		} else {
			second++;
		}
		return this;
	}

	public Time previousSecond() {
		if (second == 0) {
			second = 59;
		if (minute == 0) {
			minute = 59;
		if (hour == 0) {
			hour = 23;
		} else {
			hour--;
			}
		} else {
			minute--;
			}
		} else {
			second--;
		}
		return this;
	}
}
