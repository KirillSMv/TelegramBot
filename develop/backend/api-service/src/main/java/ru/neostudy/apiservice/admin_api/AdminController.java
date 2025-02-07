package ru.neostudy.apiservice.admin_api;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.neostudy.apiservice.admin_api.service.AdminService;
import ru.neostudy.apiservice.model.StatementFullDto;
import ru.neostudy.apiservice.model.UpdateStatementDto;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @PutMapping("/statement_status")
    @Tag(name = "Обновление статуса заявки",
            description = "Обновление статуса заявки по statement_id" +
                    " и добавление его в историю через админ панель")
    public void updateStatementStatus(@RequestBody UpdateStatementDto request) throws Exception {
        adminService.updateStatementStatus(request);
    }

    @GetMapping("/statement/{id}")
    @Tag(name = "Просмотр детальной информации о заявке",
            description = "Просмотр детальной информации о заявке с данными пользователя и направлением")
    public StatementFullDto getCompleteStatementById(@PathVariable("id") Integer id) throws Exception {
        return adminService.getCompleteStatementById(id);
    }

    @GetMapping("/statements")
    @Tag(name = "Просмотр списка всех заявок",
            description = "Просмотр списка всех заявок с детальной информацией о заявке с данными пользователя и направлением")
    public List<StatementFullDto> getCompleteStatements() {
        return adminService.getCompleteStatements();
    }
}
