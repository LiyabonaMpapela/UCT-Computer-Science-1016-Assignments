import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*; 



public class ObservationsList implements Iterable<Observation >
{ 

 ArrayList<Observation> observations;
 
 // new observationList object
  public ObservationsList()
 {
  observations = new ArrayList<>();
 }



//Adds the given observation to the observation list
public void record(Observation observation)
{
  Comparator<Observation> comp = Comparator.comparing(Observation::getTime);
  int position = Collections.binarySearch(observations, observation,comp) ; 
  if (!(position >=0))
  {
   position= (position*-1)-1;
   observations.add(position, observation);
   }
   else
    observations.add(position,observation);
   
}

//Creates an Observations object and add it to the observations list.
public void record(Registration reg, Time time)
{
 Observation observation= new Observation(reg,time);
 Comparator<Observation> comp = Comparator.comparing(Observation::getTime);
 int position = Collections.binarySearch(observations, observation,comp) ; 
  if (!(position >=0))
  {
   position= (position*-1)-1;
   observations.add(position, observation);
   }
   else
    observations.add(position,observation);


}

//get the total number of observations in the observations List
public int getTotal()
{
 return observations.size();
}

//get a list of the registration identifiers of the vehicles observed
public List<Registration> getVehicles()
{
 List<Registration> registrations = new ArrayList<>();
   for(Observation obs : observations) 
   {    
      if (! registrations.contains(obs.getIdentifier())) 
      {
      
         registrations.add(obs.getIdentifier());
      }  
    }
  return registrations;
}

 
// get an observations list that only contains all observations of the vehicle with the given registration identifier
public ObservationsList getObservations(final Registration identifer)
{
 ObservationsList observationsList = new ObservationsList();
 
 for(Observation obs : observations) 
   {
    if (obs.getIdentifier().equals(identifer))
    {
     observationsList.record(obs);
    }
   }
   return observationsList;
}


// get an observations list that only contains observations made between time s and time einclusive
public ObservationsList getObservations(final Time s, final Time e)
{
 ObservationsList observationsList = new ObservationsList();
 
 for(Observation obs : observations) 
   {
    if (obs.getTime().compareTo(s)>=0 && obs.getTime().compareTo(e)<=0)
    {
     observationsList.record(obs);
    }
   }
   return observationsList;
}


//Obtain iterator that can be used to view the observations one-by-one
public Iterator<Observation > iterator() 
{
 return observations.iterator();
}
 
}













