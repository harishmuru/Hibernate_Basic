package com.Project.Hibernate_DasSir.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		private String name;
		private String field;
		private int salary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getField() {
			return field;
		}
		public void setField(String field) {
			this.field = field;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", field=" + field + ", salary=" + salary + "]";
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(String name, String field, int salary) {
			super();
			this.name = name;
			this.field = field;
			this.salary = salary;
		}
}