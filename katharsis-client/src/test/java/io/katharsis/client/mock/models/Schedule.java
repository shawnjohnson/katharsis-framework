package io.katharsis.client.mock.models;

import java.util.List;
import java.util.Set;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;
import io.katharsis.resource.annotations.JsonApiToMany;
import io.katharsis.resource.annotations.JsonApiToOne;

@JsonApiResource(type = "schedules")
public class Schedule {

	@JsonApiId
	private Long id;

	private String name;

	@JsonApiToOne(lazy = false)
	private Task task;

	@JsonApiToOne(lazy = true)
	private Task lazyTask;

	@JsonApiToMany(opposite = "schedule")
	private Set<Task> tasks;

	@JsonApiToMany(opposite = "schedule")
	private List<Task> tasksList;

	public Long getId() {
		return id;
	}

	public Schedule setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Task getLazyTask() {
		return lazyTask;
	}

	public void setLazyTask(Task lazyTask) {
		this.lazyTask = lazyTask;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Task> getTasksList() {
		return tasksList;
	}

	public void setTasksList(List<Task> tasksList) {
		this.tasksList = tasksList;
	}

}
