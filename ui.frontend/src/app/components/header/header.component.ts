import { MapTo } from '@adobe/aem-angular-editable-components';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})

export class HeaderComponent implements OnInit {

  public buttonText:string;
  public menuObject:[];
  public pathImage:string;

  constructor() { }

  ngOnInit(): void {
  }

}

const HeaderEditConfig = {
  emptyLabel: 'HEADER',
  isEmpty(componentData) { return !componentData || !componentData.description; }
};

MapTo('bootcamp-aem/components/header')
(HeaderComponent, HeaderEditConfig)
