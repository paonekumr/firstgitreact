import React,{ useEffect} from 'react'
import Figure from './Figure'
import './index.css';
export default function Article() {
   useEffect(() => {
   
    const awesome = document.querySelector('[data-element="awesome"]');
const intrinsicSwitch = document.querySelector("#intrinsic-switch");

// Set sizing attribute based on switch
intrinsicSwitch.addEventListener("change", () => {
  awesome.setAttribute(
    "data-sizing",
    intrinsicSwitch.checked ? "intrinsic" : "extrinsic"
  );
});
    }, []);
  return (
    <div className="wrapper">
            <h1>Extrinsic sizing vs intrinsic sizing</h1>
      <Figure className="callout"/>
       
   
      <label className="toggle" >
        <span className="toggle__label">Turn on intrinsic sizing</span>
        <input type="checkbox" role="switch" className="toggle__element" id="intrinsic-switch" />
        <div className="toggle__decor" aria-hidden="true">
          <div className="toggle__thumb"></div>
        </div>
      </label>
      <p className="awesome" data-element="awesome" >Testing if this works with content so huge that in general it should fail. i am unable to understand why this is not working as expected</p>
    </div>
  )
}
