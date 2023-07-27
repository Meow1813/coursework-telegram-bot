package pro.sky.telegrambot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.telegrambot.model.NotificationTask;
import pro.sky.telegrambot.repository.NotificationTaskRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collection;

@Service
public class NotificationTaskService {
    @Autowired
    private NotificationTaskRepository notificationTaskRepository;
    public void saveNotification(NotificationTask task){
        notificationTaskRepository.save(task);
    }

    public Collection<NotificationTask> getCurrentNotification(){
        return notificationTaskRepository.findAllByDate(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
    }
}
