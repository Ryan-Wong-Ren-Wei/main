package mistermusik.commons.events.eventtypes.eventsubclasses.recurringeventsubclasses;

import mistermusik.commons.events.eventtypes.eventsubclasses.RecurrentEvent;

/**
 * Lesson type Event class.
 */
public class Lesson extends RecurrentEvent {

    /**
     * creates new lesson class with boolean to read from file.
     */
    public Lesson(String description, boolean isDone, String startDateAndTime, String endDateAndTime) {
        super(description, isDone, startDateAndTime, endDateAndTime, 'L');
    }

    /**
     * creates new lesson class with boolean to read from user input (assume incomplete).
     */
    public Lesson(String description, String startDateAndTime, String endDateAndTime) {
        super(description, false, startDateAndTime, endDateAndTime, 'L');
    }


}
