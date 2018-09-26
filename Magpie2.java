public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();

		if(statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (statement.length()>30)
		{
			response= "you talk to much.";
		}
		else if (statement.indexOf("Mr. Armstrong") >= 0)
		{
			response = "Your teacher is a great teacher.";
		}
		else if (statement.indexOf("school") >= 0)
		{
			response = "What do you like best about school?";
		}
		else if (statement.indexOf("weekend") >= 0)
		{
			response = "What do you like to do on the weekend?";
		}
		else if (statement.indexOf("computer science") >= 0)
		{
			response = "Everyone should learn computer science!";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0
				|| statement.indexOf("hamster") >= 0
				|| statement.indexOf("frog") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "How does that make you feel?";
		}
		else if (whichResponse == 5)
		{
			response = "Tell me more.";
		}
		else if (whichResponse == 6)
		{
			response = "Think positive thoughts.";
		}
		return response;
	}
}
