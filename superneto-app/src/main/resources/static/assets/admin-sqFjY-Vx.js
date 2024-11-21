import{n as d}from"./navbar-app-DT60j2GN.js";import{d as i}from"./domainName-BqwKdE-m.js";const m=async e=>(await(await fetch(e)).json()).map(({firstName:t,lastName:n,avatar:a,serialNumber:c,email:l})=>`
                <div class="col-lg-3 col-md-4 col-sm-5">
                    <div class="card m-2 rounded shadow-sm">
                        <div class="card-body"><strong>${t} ${n}</strong></div>
                        <img src="${a}" class="card-img-top" alt="${t}">
                        <div class="card-body">${c}</div>
                        <div class="card-body">${l}</div>
                    </div>                
                </div>
            `).join("");document.querySelector("#navbar-app").innerHTML=d();const p=document.querySelector(".spinner-wrapper"),y=`${i()}/api/v1/customers`,u=document.querySelector("#logout");u.addEventListener("click",e=>{localStorage.removeItem("userSesion"),window.location.href="/index.html"});const v=async e=>{const r=document.getElementById("loader");try{r.style.display="flex";const s=await m(e);document.querySelector("#list-container").innerHTML=s}catch(s){const o=document.getElementById("error-message");o.innerHTML=s,o.style.display="block",setTimeout(()=>o.style.display="none",5e3)}finally{p.style.opacity="0",r.style.display="none"}};v(y);
