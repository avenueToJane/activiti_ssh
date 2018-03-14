package cn.itcast.ssh.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Task;

import cn.itcast.ssh.web.form.WorkflowBean;

public interface IWorkflowService {

	void saveNewDeploy(File file, String fileName);

	List<Deployment> findDeploymentList();

	List<ProcessDefinition> findProcessDefinitionList();

	InputStream findImageInputStream(String deploymentId, String imageName);

	void deleteProcessDefinitionByDeploymentId(String deploymentId);

	void saveStartProcess(WorkflowBean workflowBean);

	List<Task> findTaskListByName(String name);

	

}
