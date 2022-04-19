package ss.it.interceptors;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeInterceptor implements HandlerInterceptor {

	@Autowired
	private YearMonth ym;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("TimeInterceptor.preHandle()");
		// get system date and time
		LocalDateTime time = LocalDateTime.now();
		LocalDate date1 = LocalDate.of(2022, 04, 01);
		LocalDate date2 = LocalDate.of(2022, 04, 30);
		LocalDate date3 = LocalDate.now();
		
			// get current hour of the day
			int hour = time.getHour();
			
			if (hour < 9 || hour > 17) {
				RequestDispatcher rd = request.getRequestDispatcher("/timedOut.jsp");
				rd.forward(request, response);
				return false;
			}else if(date3.isAfter(date1) && date3.isBefore(date2)) {
				RequestDispatcher rd = request.getRequestDispatcher("/dateOut.jsp");
				rd.forward(request, response);
				return false;
		} //  else if
		else{
			return date3.isAfter(date1) && date3.isBefore(date2);
		}//else
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("TimeInterceptor.postHandle()");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("TimeInterceptor.afterCompletion()");
	}
}
