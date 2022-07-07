import React from 'react'
import './index.css';
export default function figure() {
  return (
    <div className="callout">
       <p>
          Notice that when the box is using <strong>extrinsic sizing</strong>, there’s
          a limit of how much content you can add before it overflows out of the box’s
          bounds. This makes the word, “awesome”, overflow.
        </p>
    </div>
  )
}
