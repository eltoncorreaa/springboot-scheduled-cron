package com.elton.app.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	/**
	 * Executa este metódo a cada 3 minutos
	 * Cron expression is represented by six fields: second, minute, hour, day of month, month, day(s) of week
	 */
	@Scheduled(fixedRate = 180000)
	public void reportCurrentTime1() {
		log.info("Job 1.The time is now {}", dateFormat.format(new Date()));
	}

	/**
	 * Executa este metódo todos os dias as 00:00
	 * Cron expression is represented by six fields: second, minute, hour, day of month, month, day(s) of week
	 *
	 */
	@Scheduled(cron = "0 0 * * * *")
	public void reportCurrentTime2() {
		log.info("Job 2.The time is now {}", dateFormat.format(new Date()));
	}

	/**
	 * Executa este metódo a cada dez segundos
	 * Cron expression is represented by six fields: second, minute, hour, day of month, month, day(s) of week
	 *
	 */
	@Scheduled(cron = "*/10 * * * * *")
	public void reportCurrentTime3() {
		log.info("Job 3. The time is now {}", dateFormat.format(new Date()));
	}

	/**
	 * Executa este metódo as 8h, 9h e 10h todos os dias.
	 * Cron expression is represented by six fields: second, minute, hour, day of month, month, day(s) of week
	 *
	 */
	@Scheduled(cron = "0 0 8-10 * * *")
	public void reportCurrentTime4() {
		log.info("Job 4.The time is now {}", dateFormat.format(new Date()));
	}

	/**
	 * Executa este metódo as 8:00, 8:30, 9:00, 9:30 e 10h todos os dias.
	 * Cron expression is represented by six fields: second, minute, hour, day of month, month, day(s) of week
	 *
	 */
	@Scheduled(cron = "0 0/30 8-10 * * *")
	public void reportCurrentTime5() {
		log.info("Job 5.The time is now {}", dateFormat.format(new Date()));
	}

	/**
	 * Executa este metódo de 09h as 17h de segunda a sexta.
	 * Cron expression is represented by six fields: second, minute, hour, day of month, month, day(s) of week
	 *
	 */
	@Scheduled(cron = "0 0 9-17 * * MON-FRI")
	public void reportCurrentTime6() {
		log.info("Job 6.The time is now {}", dateFormat.format(new Date()));
	}

	/**
	 * Executa este metódo todos os dias 25 e mês 12 as 00:00
	 * Cron expression is represented by six fields: second, minute, hour, day of month, month, day(s) of week
	 *
	 */
	@Scheduled(cron = "0 0 0 25 12 ?")
	public void reportCurrentTime7() {
		log.info("Job 7.The time is now {}", dateFormat.format(new Date()));
	}
}
