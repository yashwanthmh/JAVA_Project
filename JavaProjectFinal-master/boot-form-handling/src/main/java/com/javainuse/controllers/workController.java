package com.javainuse.controllers;

import java.util.List;
import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.model.work;
import com.javainuse.service.workService;

@SuppressWarnings("unused")
@Controller
public class workController {

	@Autowired
	workService workservice;
	
	@RequestMapping("/")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping("/welcome")
	public ModelAndView firstPageAlso() {
		return new ModelAndView("welcome");
	}

	@RequestMapping(value = "/addWorkshop", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addWorkshop", "work", new work());
	}

	@RequestMapping(value = "/addWorkshop", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("work") work w) {
		
		workservice.insertWork(w);
		List<work> works = workservice.getAllWorks();
		ModelAndView model = new ModelAndView("getWorkshop");
		model.addObject("works", works);
		return model;
	}

	@RequestMapping("/getWorkshops")
	public ModelAndView getEmployees() {
		List<work> works = workservice.getAllWorks();
		ModelAndView model = new ModelAndView("getWorkshop");
		model.addObject("works", works);
		return model;
	}
	
	
	//for id
	@RequestMapping(value= "/getWorkshopsByID", method = RequestMethod.GET)
	public ModelAndView EnterID()
	{
		return new ModelAndView("enterID");
	}
	
	@RequestMapping(value= "/getWorkshopsByID", method = RequestMethod.POST)
	public ModelAndView getByID(@RequestParam("id") String id)//@ModelAttribute("id") String id)
	{
		work w = workservice.getWorkById(id);
		List<work> works = new ArrayList<work>();
		works.add(w);
		ModelAndView model = new ModelAndView("getByID");
		model.addObject("work", works);
		return model;
	}
	
	
	//for topic
	@RequestMapping(value= "/getWorkshopsByTopic", method = RequestMethod.GET)
	public ModelAndView EnterTopic()
	{
		return new ModelAndView("enterTopic");
	}
	
	@RequestMapping(value= "/getWorkshopsByTopic", method = RequestMethod.POST)
	public ModelAndView getByTopic(@RequestParam("topic") String topic)//@ModelAttribute("id") String id)
	{
		List<work> works = workservice.getWorkByTopic(topic);
		ModelAndView model = new ModelAndView("getByTopic");
		model.addObject("works", works);
		return model;
	}
	
	
	//for college
		@RequestMapping(value= "/getWorkshopsByCollege", method = RequestMethod.GET)
		public ModelAndView EnterCollege()
		{
			return new ModelAndView("enterCollege");
		}
		
		@RequestMapping(value= "/getWorkshopsByCollege", method = RequestMethod.POST)
		public ModelAndView getByCollege(@RequestParam("college") String college)//@ModelAttribute("id") String id)
		{
			List<work> works = workservice.getWorkByCollege(college);
			ModelAndView model = new ModelAndView("getByCollege");
			model.addObject("works", works);
			return model;
		}
		
		
		//for year
		@RequestMapping(value= "/getWorkshopsByYear", method = RequestMethod.GET)
		public ModelAndView Enteryear()
		{
			return new ModelAndView("enterYear");//, "id" , new String());
		}
		
		@RequestMapping(value= "/getWorkshopsByYear", method = RequestMethod.POST)
		public ModelAndView getByYear(@RequestParam("year") int year)
		{
			List<work> works = workservice.getWorkByYear(year);
			ModelAndView model = new ModelAndView("getByYear");
			model.addObject("works", works);
			return model;
		}
		//for date
		@RequestMapping(value= "/getWorkshopsByDate", method = RequestMethod.GET)
		public ModelAndView Enterdate()
		{
			return new ModelAndView("enterDate");//, "id" , new String());
		}
		
		@RequestMapping(value= "/getWorkshopsByDate", method = RequestMethod.POST)
		public ModelAndView getByDate(@RequestParam("date") int date)
		{
			List<work> works = workservice.getWorkByDate(date);
			ModelAndView model = new ModelAndView("getByDate");
			model.addObject("works", works);
			return model;
		}
		
		
		//for month
		@RequestMapping(value= "/getWorkshopsByMonth", method = RequestMethod.GET)
		public ModelAndView EnterMonth()
		{
			return new ModelAndView("enterMonth");
		}
		
		@RequestMapping(value= "/getWorkshopsByMonth", method = RequestMethod.POST)
		public ModelAndView getByMonth(@RequestParam("month") String month)
		{
			String mon="";
			if(month.equals("jan"))
				mon="01";
			else if(month.equals("feb"))
				mon="02";
			else if(month.equals("mar"))
				mon="03";
			else if(month.equals("apr"))
				mon="04";
			else if(month.equals("may"))
				mon="05";
			else if(month.equals("jun"))
				mon="06";
			else if(month.equals("jul"))
				mon="07";
			else if(month.equals("aug"))
				mon="08";
			else if(month.equals("sep"))
				mon="09";
			else if(month.equals("oct"))
				mon="10";
			else if(month.equals("nov"))
				mon="11";
			else if(month.equals("dec"))
				mon="12";
			
			
			List<work> works = workservice.getWorkByMonth(mon);
			ModelAndView model = new ModelAndView("getByMonth");
			model.addObject("works", works);
			return model;
		}
		
		
		//for city
				@RequestMapping(value= "/getWorkshopsByCity", method = RequestMethod.GET)
				public ModelAndView EnterCity()
				{
					return new ModelAndView("enterCity");
				}
				
				@RequestMapping(value= "/getWorkshopsByCity", method = RequestMethod.POST)
				public ModelAndView getByCity(@RequestParam("city") String city)
				{
					List<work> works = workservice.getWorkByCity(city);
					ModelAndView model = new ModelAndView("getByCity");
					model.addObject("works", works);
					return model;
				}
		
		
		
		
		
		//for organizer
				@RequestMapping(value= "/getWorkshopsByOrganizer", method = RequestMethod.GET)
				public ModelAndView EnterOrganizer()
				{
					return new ModelAndView("enterOrganizer");
				}
				
				@RequestMapping(value= "/getWorkshopsByOrganizer", method = RequestMethod.POST)
				public ModelAndView getByOrganizer(@RequestParam("organiser") String organiser)
				{
					List<work> works = workservice.getWorkByOrganiser(organiser);
					ModelAndView model = new ModelAndView("getByOrganizer");
					model.addObject("works", works);
					return model;
				}
				
		//Update by x
				@RequestMapping(value="/UpdateByField", method = RequestMethod.GET)
				public ModelAndView ChooseFieldAndUpdate()
				{
					return new ModelAndView("updateByField");
				}
				
				@RequestMapping(value="/UpdateByField", method = RequestMethod.POST)
				public ModelAndView UpdatedChosenField(@RequestParam("workid") String workid, @RequestParam("field") String field, 
						@RequestParam("fieldType") String fieldType)
				{
					workservice.updateField(workid, field, fieldType);
					List<work> works = workservice.getAllWorks();
					ModelAndView model = new ModelAndView("getWorkshop");
					model.addObject("works", works);
					return model;
				}
				
		//Update All
				@RequestMapping(value="/UpdateAll", method = RequestMethod.GET)
				public ModelAndView UpdateAll()
				{
					return new ModelAndView("updateAll");
				}
				
				@RequestMapping(value="/UpdateAll", method = RequestMethod.POST)
				public ModelAndView UpdatedChosenField(@RequestParam("workid") String workid, 
						@RequestParam("topic") String topic,@RequestParam("venue") String venue,
						@RequestParam("wsdate") String wsdate,@RequestParam("regfee") String regfee,
						@RequestParam("organiser") String organiser,@RequestParam("location") String location)
				{
					workservice.updateAll(workid, topic, venue, wsdate, regfee, organiser, location);
					List<work> works = workservice.getAllWorks();
					ModelAndView model = new ModelAndView("getWorkshop");
					model.addObject("works", works);
					return model;
				}
				
		//copy paste
				
		//Delete
				@RequestMapping(value="/Delete", method = RequestMethod.GET)
				public ModelAndView ChooseDelete()
				{
					return new ModelAndView("delete");
				}
				
				@RequestMapping(value="/Delete", method = RequestMethod.POST)
				public ModelAndView Deleted(@RequestParam("field") String field, @RequestParam("fieldType") String fieldType)
				{
					workservice.Delete(field, fieldType);
					List<work> works = workservice.getAllWorks();
					ModelAndView model = new ModelAndView("getWorkshop");
					model.addObject("works", works);
					return model;
				}
}