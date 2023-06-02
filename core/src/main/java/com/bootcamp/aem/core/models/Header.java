package com.bootcamp.aem.core.models;

import lombok.Getter;
import java.util.List;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import com.adobe.cq.export.json.ComponentExporter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import static lombok.AccessLevel.NONE;
import static org.apache.sling.models.annotations.DefaultInjectionStrategy.OPTIONAL;
@Getter
@Model( defaultInjectionStrategy = OPTIONAL,
		resourceType = Header.RESOURCE_TYPE,
		adaptables = SlingHttpServletRequest.class,
		adapters = { ComponentExporter.class, Header.class, } )

public class Header implements ComponentExporter {

	static final String RESOURCE_TYPE = "bootcamp-aem/components/header";

	@Getter(NONE)
	@Inject ResourceResolver resourceResolver;

	@ValueMapValue private String buttonText;
	@ValueMapValue private String pathImage;


	@ChildResource List<Resource> menuObject;


	@Override public String getExportedType() { return RESOURCE_TYPE; }
}

