package com.itrexgroup.collectors.log_entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LogEntryCounter {
    public static void main(String[] args) {
        /*  Write a collector that calculates how many times was clicked each url by users.
        The collector will be applied to a stream of log entries for creating a map: url -> click count.    */

        List<LogEntry> logs = new ArrayList<>();
        logs.add(new LogEntry(new Date(), "Khrusha", "stepik.org"));
        logs.add(new LogEntry(new Date(), "Khrusha", "stepik.org"));
        logs.add(new LogEntry(new Date(), "Karkusha", "stepik.org"));
        logs.add(new LogEntry(new Date(), "Stepashka", "stepik.org"));
        logs.add(new LogEntry(new Date(), "Khrusha", "github.com"));
        logs.add(new LogEntry(new Date(), "Karkusha", "github.com"));
        logs.add(new LogEntry(new Date(), "Stepashka", "stackoverflow.com"));
        logs.add(new LogEntry(new Date(), "Stepashka", "stackoverflow.com"));
        logs.add(new LogEntry(new Date(), "Stepashka", "stackoverflow.com"));

        Map<String, Long> res = logs.stream()
                .collect(Collectors.groupingBy(LogEntry::getUrl, Collectors.counting()));

        res.forEach((x,y) -> System.out.println(x + ": " + y + " times"));
    }
}
