function checkAllMenu() {
  const chkAll = document.querySelector('#chk_all');
  const checkboxes = document.querySelectorAll('.menu, ul input[type="checkbox"]');
  checkboxes.forEach(chk => chk.checked = chkAll.checked);
}

function checkAllOption(menuCheckbox) {
  const options = menuCheckbox.closest('li').querySelectorAll('ul input[type="checkbox"]');
  options.forEach(option => option.checked = menuCheckbox.checked);
  updateCheckAll();
}

function updateCheckAll() {
  const chkAll = document.querySelector('#chk_all');
  const menus = document.querySelectorAll('.menu');
  const options = document.querySelectorAll('ul input[type="checkbox"]');
  const allChecked = [...menus, ...options].every(chk => chk.checked);

  chkAll.checked = allChecked;
}

document.querySelectorAll('ul input[type="checkbox"]').forEach(option => {
  option.addEventListener('click', function() {
      const menuCheckbox = option.closest('li').querySelector('.menu');
      const options = option.closest('ul').querySelectorAll('input[type="checkbox"]');
      menuCheckbox.checked = [...options].every(opt => opt.checked);
      updateCheckAll();
  });
});