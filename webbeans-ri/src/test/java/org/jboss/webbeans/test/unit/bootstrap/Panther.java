package org.jboss.webbeans.test.unit.bootstrap;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.webbeans.Production;

@Production
@Stateful
class Panther
{
   
   @Remove
   public void remove(String foo)
   {
      
   }

}
