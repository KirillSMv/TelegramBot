package ru.neostudy.apiservice.admin_api.service;

import ru.neostudy.apiservice.model.StatementFullDto;
import ru.neostudy.apiservice.model.UpdateStatementDto;

import java.util.List;

public interface AdminService {
    void updateStatementStatus(UpdateStatementDto statementDto) throws Exception;

    StatementFullDto getCompleteStatementById(Integer id) throws Exception;

    List<StatementFullDto> getCompleteStatements();

}

