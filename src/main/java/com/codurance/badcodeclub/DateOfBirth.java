package com.codurance.badcodeclub;

public class DateOfBirth {
  private final int dayOfBirth;
  private final int monthOfBirth;
  private final int yearOfBirth;

  public DateOfBirth(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
    this.dayOfBirth = dayOfBirth;
    this.monthOfBirth = monthOfBirth;
    this.yearOfBirth = yearOfBirth;
  }

  public int getDayOfBirth() {
    return dayOfBirth;
  }

  public int getMonthOfBirth() {
    return monthOfBirth;
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }
}
