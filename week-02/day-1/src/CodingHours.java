public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        float daily = 6;
        float week = 17;
        float workdays = 5;
        float days = 7;
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        float semester = week * days;
        float codingdays = week * workdays;
        float workingdays= semester - (semester-codingdays);
        float codinghours = workingdays * daily;
        System.out.print(codinghours + "\n");

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        float workhours = 52;
        float codeweek = daily * workdays;
        float percentage = codeweek / workhours;
        System.out.println("percentage: " + percentage);
    }
}