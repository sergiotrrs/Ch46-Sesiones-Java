import{n as a}from"./navbar-app-DT60j2GN.js";import{d}from"./domainName-BqwKdE-m.js";const i=async t=>{const s=await fetch(t);if(s.status!==200)throw(await s.json()).message;return(await s.json())._embedded.products.map(({name:o,image:c,price:n})=>`
                <div class="col-lg-3 col-md-4 col-sm-5">
                    <div class="card m-2 rounded shadow-sm">
                        <div class="card-body"><strong>${o} </strong></div>
                        <img src="${c}" class="card-img-top" alt="${o}">
                        <div class="card-body">$ ${n} M.N.</div>
                    </div>                
                </div>
            `).join("")};document.querySelector("#navbar-app").innerHTML=a();const l=document.querySelector(".spinner-wrapper"),p=`${d()}/api/v3/products`,m=async t=>{const s=document.getElementById("loader");try{s.style.display="flex";const r=await i(t);document.querySelector("#list-container").innerHTML=r}catch(r){const e=document.getElementById("error-message");e.innerHTML=r,e.style.display="block",setTimeout(()=>e.style.display="none",5e3)}finally{l.style.opacity="0",s.style.display="none"}};m(p);
