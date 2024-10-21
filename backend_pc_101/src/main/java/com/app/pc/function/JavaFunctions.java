package com.app.pc.function;

import com.app.pc.model.Manager;
import com.app.pc.model.Pet;
import com.app.pc.model.PetCareCenter;
import com.app.pc.model.PetOwner;
import com.app.pc.model.Document;
import com.app.pc.model.PetService;
import com.app.pc.enums.PetServiceType;
import com.app.pc.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.pc.repository.PetServiceRepository;
import com.app.pc.repository.PetOwnerRepository;
import com.app.pc.repository.PetCareCenterRepository;
import com.app.pc.repository.ManagerRepository;
import com.app.pc.repository.DocumentRepository;
import com.app.pc.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
