import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'pm-ratings',
  templateUrl: './ratings.component.html',
  styleUrls: ['./ratings.component.scss'],
})
export class RatingsComponent implements OnInit {
  @Input() ratings: number = 0;
  @Output() ratingClickEvent: EventEmitter<string> = new EventEmitter<string>();

  constructor() {}

  ngOnInit(): void {
    if (this.ratings < 0 || this.ratings > 5) {
      this.ratings = 0;
    }
  }

  onClickRatings() {
    this.ratingClickEvent.emit(
      `Selected Rating Value is ${this.ratings} out of 5`
    );
  }
}
