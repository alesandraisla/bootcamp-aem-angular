import { Component, OnInit } from '@angular/core';
import { MapTo } from '@adobe/aem-angular-editable-components';


@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.scss']
})
export class ContentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}


const ContentEditConfig = {
  emptyLabel: 'CONTENT',
  isEmpty(componentData) { return !componentData || !componentData.description; }
};

MapTo('bootcamp-aem/components/content')
(ContentComponent, ContentEditConfig)

