package com.example.web.jsp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.web.jsp.model.User;
import com.example.web.jsp.service.UserService;

@Controller

public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/users")
	public String userList(Map<String, Object> model) {
		model.put("users", userService.getUsers());

		return "/users/index";
	}

	@RequestMapping(value = "/users/index/{id}", method = RequestMethod.GET)
	public String deleteUser(@PathVariable long id, Map<String, Object> model,
			final RedirectAttributes redirectAttributes) {
		User user = userService.getUser(id);
		boolean deleted = userService.deleteUser(id);

		if (deleted == true) {
			redirectAttributes.addFlashAttribute("message",
					"User " + user.getFirstname() + " " + user.getLastname() + " deleted successfully.");
		} else {

			redirectAttributes.addFlashAttribute("message",
					"User " + user.getFirstname() + " " + user.getLastname() + " not found.");
		}
		return "redirect:/users";
	}

	@RequestMapping(value = "/users/newuser", method = RequestMethod.GET)
	public String createRequest() {
		return "/users/create";
	}

	@RequestMapping(value = "/users/edit/{id}", method = RequestMethod.GET)
	public ModelAndView showEditedUser(@PathVariable long id) {
		return new ModelAndView("/users/edit", "user", userService.getUser(id));

	}

	@RequestMapping(value = "/users/updated", method = RequestMethod.POST)
	public String updateUser(@RequestParam(value = "id", required = true) long id,
			@RequestParam(value = "firstname", required = true) String firstname,
			@RequestParam(value = "lastname", required = true) String lastname,
			@RequestParam(value = "address", required = true) String address) {

		userService.updateUser(id, firstname, lastname, address);

		return "redirect:/users";
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String saveUser(

			@RequestParam(value = "firstname", required = true) String firstname,
			@RequestParam(value = "lastname", required = true) String lastname,
			@RequestParam(value = "address", required = true) String address) {
		userService.saveUser(firstname, lastname, address);
		return "redirect:/users";
	}

}
