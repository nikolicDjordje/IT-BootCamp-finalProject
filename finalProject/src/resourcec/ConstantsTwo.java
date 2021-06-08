package resourcec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConstantsTwo {
	public static WebDriver driver;

	public static final String ELEMENTS_CLASS = "_primNavQtip j-primary-navigation-qtip ";
	public static final List<WebElement> elementList = driver.findElements(By.className(ELEMENTS_CLASS));
	public static final String DASHBOARD_TITLE = "Dashboard - Dashboard - Humanity";
	public static final String DASHBOARD_XPATH = "//*[@id=\"_notifycount\"]";
	public static final String PLANING_TITLE = "ShiftPlanning - Humanity";
	public static final String PLANING_XPATH = "//*[@id=\"sn_schedule\"]";
	public static final String TIME_TITLE = "Timeclock - Overview - Humanity";
	public static final String TIME_XPATH = "//*[@id=\"sn_timeclock\"]";
	public static final String LEAVE_TITLE = "Leave - Vacation - Humanity";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]";
	public static final String TRAINING_TITLE = "Training - Overview - Humanity";
	public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]";
	public static final String STUFF_TITLE = "Staff - Humanity";
	public static final String AVIABILITY_TITLE = "Humanity";
	public static final String AVIABILITY_XPATH = "//*[@id=\"topMenu\"]/li[7]";
	public static final String PAYROLL_TITLE = "Payroll - Scheduled-hours - Humanity";
	public static final String PAYROLL_XPATH = "//*[@id=\"topMenu\"]/li[8]";
	public static final String REPORTS_TITLE = "Reports - Reports Home - Humanity";
	public static final String REPORTS_XPATH = "//*[@id=\"topMenu\"]/li[9]";
	public static final String SETTINGS_TITLE = "Settings - Manage Settings - Humanity";
	public static final String SETTINGS_XPATH = "//*[@id=\"_nav\"]/div[3]/ul/li";
	public static final String STUFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	public static final String ADD_ID = "act_primary";
	public static final String NAME_XPATH = "//*[@id=\"_asf1\"]";
	public static final String NAME = "katarina";
	public static final String LAST_NAME_XPATH = "//*[@id=\"_asl1\"]";
	public static final String LAST_NAME = "mihajlovic";
	public static final String EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	public static final String EMAIL = "moj163@email.com";
	public static final String SAVE_XPATH = "//*[@id=\"_as_save_multiple\"]";
	public static final String EMPLOYEE_LINK = "https://kompanija253.humanity.com/app/staff/assignstaff&new=1&first=6361833/";
	public static final String STAFF_LINK = "https://kompanija253.humanity.com/app/staff/";
	public static final String EXPECTED_NAME = "katarina mihajlovic";
	public static final String EXPECTED_SPAN = "//*[@id=\"10\"]/span";
	public static final String BUTTON_XPATH = "//*[@id=\"stafftl_\"]/div[1]";
	public static final String EMPLOYEE_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/div/table/tbody/tr[3]/td[1]";
	public static final String EMPLOYEE_CLASS = "employee ";
	public static final String EXPECTED = "katarina mihajlovic";
	public static final String KACA_XPATH = "//*[@id=\"7\"]/a";
	public static final String EDIT_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String LAST_NAME_ID = "last_name";
	public static final String SAVE_BUTTON_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	public static final String SAVE_ID = "_as_save_multiple";
	public static final String FIRST_NAME_CLASS = "\"_ns_fname\"";
	public static final String LAST_NAME_CLASS = "_ns_lname";
	public static final String EMAIL_CLASS = "_ns_email";

}
