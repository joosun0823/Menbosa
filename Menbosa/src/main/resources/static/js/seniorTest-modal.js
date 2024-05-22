document.addEventListener('DOMContentLoaded', () => {
  const endTestButton = document.querySelector('.end');
  const modalBackground = document.querySelector('.protector-result-background');
  const modalBox = document.querySelector('.protector-result-modalBox');

  endTestButton.addEventListener('click', () => {
    modalBackground.style.display = 'block';
    // modalBox.style.display = 'block';
  });
});