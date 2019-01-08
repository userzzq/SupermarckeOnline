package top.wfzzq.supermarckeonline.service;

import top.wfzzq.supermarckeonline.model.LogsModel;
import top.wfzzq.supermarckeonline.utils.JsonMessage;

public interface LogsService {

    JsonMessage queryAll(LogsModel model) throws Exception;

}
