package ru.neostudy.apiservice.model.mapper;

import org.springframework.stereotype.Component;
import ru.neostudy.apiservice.bot.Course;
import ru.neostudy.apiservice.model.BotUser;
import ru.neostudy.apiservice.model.User;
import ru.neostudy.apiservice.model.UserDto;

@Component
public class UserDtoMapper {
    public UserDto fromBotUsertoUserDto(BotUser botUser) {
        return UserDto.builder()
                .telegramId(botUser.getTelegramUserId())
                .firstName(botUser.getFirstName())
                .lastName(botUser.getLastName())
                .city(botUser.getCity())
                .email(botUser.getEmail())
                .phone(botUser.getPhone())
                .role(botUser.getRole())
                .course(botUser.getCourse())
                .build();
    }

    public UserDto fromUsertoUserDto(User user, Course course) {
        return UserDto.builder()
                .telegramId(user.getTelegramId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .city(user.getCity())
                .email(user.getEmail())
                .phone(user.getPhone())
                .role(user.getRole())
                .course(course)
                .build();
    }
}
